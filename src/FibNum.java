public class FibNum {
    int current;
    int byCount;

    FibNum(int current, int byCount)
    {
        this.current = current;
        this.byCount = byCount;
    }

    public String Verbose(){
        return String.format("%d число Фибоначчи: %d", this.byCount, this.current);
    }

    public String[] getCurrent(int range) {
        String[] str = new String[50];
        int last = 1, prelast = 0;
        FibNum doCount = new FibNum(1, 1);
        for(doCount.byCount = 1; doCount.byCount < range + 1; doCount.byCount++)
        {
            str[doCount.byCount - 1] = doCount.Verbose();
            doCount.current = (last + prelast);
            prelast = last;
            last = doCount.current;
        }
        return str;
    }
}
