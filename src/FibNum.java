public class FibNum {
    int current;
    int byCount;

    public FibNum()
    {
        this.current = 1;
        this.byCount = 1;
    }

    public FibNum(FibNum numberFib){
        this.current = numberFib.current;
        this.byCount = numberFib.byCount;
    }


    private String Verbose(){
        return String.format("%d число Фибоначчи: %d", this.byCount, this.current);
    }

    public static String[] reciveCurrent(FibNum doCount, int range) {
        String[] str = new String[50];
        int last = 1, preLast = 0;
        for(doCount.byCount = 1; doCount.byCount < range + 1; doCount.byCount++)
        {
            str[doCount.byCount - 1] = doCount.Verbose();
            doCount.current = (last + preLast);
            preLast = last;
            last = doCount.current;
        }
        return str;
    }
}
