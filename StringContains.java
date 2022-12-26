class StringContains {
    public static void main(String[] args) {
        String s1="carrertuner";
        String s2="carrertuners";
        String endstr="er";
        boolean ends1=s1.endsWith(endstr);
        boolean ends2=s2.endsWith(endstr);
        System.out.println("check first string endswith  endstr: "+ends1);
        System.out.println("check second string endswith endstr: "+ends2);
    }
}