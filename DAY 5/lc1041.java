class lc1041
{
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        int i=0;
        for(char ch:instructions.toCharArray())
        {
            if(ch=='L')
            {
                i=(i+1)%4;
                
            }
            else if(ch=='R')
            {
                i=(i+3)%4;
            }
            else
            {
                if(i==0)
                {
                    y++;
                }
                else if(i==1)
                {
                    x--;
                }
                else if(i==2)
                {
                    y--;
                }
                else
                {
                    x++;
                }
            }

            
        }
        return (x==0 && y==0)||(i!=0);
    }
}







/*

int x=0;
        int y=0;
        char dir='N';
        for(char ch:instructions.toCharArray())
        {
            if(ch=='G')
            {
                if(dir=='N')
                {
                    y++;
                }
                else if(dir=='S')
                {
                    y--;
                }
                else if(dir=='W')
                {
                    x--;
                }
                else
                {
                    x++;
                }
            }
            else if(ch=='L')
            {
                if(dir=='N')
                {
                    dir='W';
                }
                else if(dir=='S')
                {
                    dir='E';
                }
                else if(dir=='W')
                {
                    dir='S';
                }
                else
                {
                    dir='N';
                }
            }
            else
            {
                if(dir=='N')
                {
                    dir='E';
                }
                else if(dir=='S')
                {
                    dir='W';
                }
                else if(dir=='W')
                {
                    dir='N';
                }
                else
                {
                    dir='S';
                }
            }
        }
        if(dir!='N')
        {
            return true;
        }
        return (x==0 && y==0)?true:false;

*/
