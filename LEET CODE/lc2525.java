public class lc2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length*width*height;

        if((length>=10000 || width>=10000 || height>=10000 || mass>=10000 || vol>=1000000000) && mass>=100)
        {
            return "Both";
        }
        else if((length>=10000 || width>=10000 || height>=10000 || mass>=10000 || (length*width*height)>=1000000000) && mass<100)
        {
            return "Bulky";
        }
        else if((length<10000 || width<10000 || height<10000 || mass<10000 || (length*width*height)<1000000000) && mass>=100)
        {
            return "Heavy";
        }
        else
        {
            return "Neither";
        }
    }
}

