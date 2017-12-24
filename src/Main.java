public class Main {
     public static void fitness(Individual a) {//一个长得像适应度函数的东西，然而暂时是空的
        int i=0;
        int j[]=decode(a.gene);
        for(Individual indi : pop.population){

        }
        //compute fitness
     }
     public static int[] decode(boolean[][] a) {//额……大概是解码
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
    static Population pop = new Population(100);

    public static void main(String args[]){//暂时没卵用的主方法
       //Individual setOfIndividual[] = new Individual[100];
       Environment env = new Environment();


    }
}
