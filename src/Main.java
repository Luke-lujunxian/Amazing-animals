public class Main {
     public static void fitness(Individual a) {
        int i=0;
        int j[]=decode(a.gene);
        //compute fitness
     }
     public static int[] decode(boolean[][] a) {
         int[] h=new int[a.length];
         for(int i=0;i<a.length;i++){
             int j=0;
             for(int k=0;k<a[i].length;k++) if(a[i][k]) if(k>0) j+=2*k; else j+=1;
             switch (i) {
                 case 0:
                 case 1:
                    h[i]=j*10;
                    continue;
                 default:
                     h[i]=j+1;
             }
         }
         return h;
    }
    public static void main(String args[]){
       Individual setOfIndividual[] = new Individual[100];
       Environment env1 = new Environment();
    }
}
