public class Main {
     public static void fitness(Individual a) {//一个长得像适应度函数的东西，然而暂时是空的
            int j[]=decode(a.gene);
            Environment dlt=new Environment();
            a.fitness=1-Math.abs(j[0]-dlt.getOxygenLevel())*0.005-Math.abs(j[1]-dlt.getHumidity())*0.01-Math.abs(j[2]-dlt.getFood())*0.1-Math.abs(j[3]-dlt.getTemperature())*0.01+j[4]+j[5];
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
