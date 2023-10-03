class QSP12_NestedLoop_Intro {
    public static void main(String[] args) {
 
        for (int i=0; i<2; i++)
        {
            for (int k=0; k<3; k++)
            {
                System.out.println("Intro:- NestedFor loop");
            }
            System.out.println("-------------------------");
        }
        System.out.println("\n3 line has been printed in 1 execution\nTotal outer execution are 2 & inner execution are 3...\n\tTherefore total lines are 3x2=6");
        System.out.println("*- Observe the output to understand it -*");
    }
}
