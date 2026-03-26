public class lc345 {
    public String reverseVowels(String s) {
        int l=0;
        
        char[] arr=s.toCharArray();
        int h=arr.length-1;
        while(l<h)
        {
            if(!(isv(arr[l])) )
            {
                l++;
            }
            if(!(isv(arr[h])))
            {
                h--;
            }
            if(isv(arr[l]) && isv(arr[h]))
            {            
                char c=arr[l];
                arr[l]=arr[h];
                arr[h]=c;
                l++;
                h--;
            }

            
            
        }
        return new String(arr);
    }
    public boolean isv(char ch)
    {
        return !(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U');
    }
}

