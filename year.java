class year{
    public static void main(String[] args){
        int d;
        int y;
        int w;
        y=365;
        w=365/7;
        d=((y*365)+(w*7));
        System.out.println(y=d/365);
        System.out.println(w=(d%365)/7);
        System.out.println(d=d-((y*365)+(w*7)));
    }
}
