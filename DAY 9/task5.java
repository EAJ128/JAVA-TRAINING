abstract class Device{
    abstract void deviceOn();
    abstract void deviceOff();
}
class Light extends Device{
    @Override
    void deviceOn(){
        System.out.println("Light On");
    }
    @Override
    void deviceOff(){
        System.out.println("Light Off");
    }
}
class AC extends Device{
    @Override
    void deviceOn(){
        System.out.println("AC on");
    }
    @Override
    void deviceOff(){
        System.out.println("AC off");
    }
}
interface Trigger{
    boolean istriggered();
}
class motiontrigger implements Trigger{
    @Override
    public boolean istriggered(){
        return true;
    }
}
class temptrigger implements Trigger{
    int temp;
    temptrigger(int temp){
        this.temp = temp;
    }
    @Override
    public boolean istriggered(){
        return temp>30;
    }
}
class timetrigger implements Trigger{
    int hour;
    timetrigger(int hour){
        this.hour = hour;
    }
    @Override
    public boolean istriggered(){
        return hour == 19;//7pm
    }
}
interface Action{
    void execute();
}
class TurnOnAction implements Action{
    Device dev;
    TurnOnAction(Device dev){
        this.dev = dev;
    }
    @Override
    public void execute(){
        dev.deviceOn();
    }
}
class TurnOffAction implements Action{
    Device dev;
    TurnOffAction(Device dev){
        this.dev = dev;
    }
    @Override
    public void execute(){
        dev.deviceOff();
    }
}
class Rule{
    Trigger trigger;
    Action action;
    Rule(Trigger trigger,Action action){
        this.trigger = trigger;
        this.action = action;
    }
    void result(){
        if(trigger.istriggered()){
            action.execute();
        }
        else
            System.out.println("Trigger action not met");

    }
}
public class task5 {
    public static void main(String[] args){
        Device light = new Light();
        Device ac = new AC();

        Trigger motion = new motiontrigger();
        Trigger temp = new temptrigger(35);
        Trigger time = new timetrigger(19);

        Action lightOn = new TurnOnAction(light);
        Action lightOff = new TurnOffAction(light);
        Action acOn = new TurnOnAction(ac);

        Rule r1 = new Rule(motion,lightOn);
        Rule r2 = new Rule(temp,acOn);
        Rule r3 = new Rule(time,lightOff);
        r1.result();
        r2.result();
        r3.result();
    }
}