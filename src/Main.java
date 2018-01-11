public class Main {
     public static void fitness(Individual a) {//一个长得像适应度函数的东西，然而不是空的
            int j[]=decode(a.gene);
            a.fitness = 1-Math.abs(j[0]-dlt.getOxygenLevel())*0.005-Math.abs(j[1]-dlt.getHumidity())*0.01-Math.abs(j[2]-dlt.getFood())*0.1-Math.abs(j[3]-dlt.getTemperature())*0.01+j[4]+j[5];
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
    private static Population pop;
    private static Environment dlt;
    public static void main(String args[]){//暂时没卵用的主方法
        //Set up population
       
        dlt=new Environment();
        Fenestra allah = new Fenestra(dlt);
        pop = new Population(100);
        double lastBestFitness = 0.0;
        while(true){

            //计算适应度
            for (int i = 0; i< Population.setOfIndividual.size(); i++){
                fitness((Individual) Population.setOfIndividual.get(i));
            }
<<<<<<< HEAD
            Individual  temp = (Individual)(Population.setOfIndividual.firstElement());
            Individual[] beforeSort=new Individual[Population.setOfIndividual.size()];
            for(int i=0;i<Population.setOfIndividual.size();i++){
                beforeSort[i]=(Individual) Population.setOfIndividual.get(i);
            }
            Individual[] afterSort=new Individual[Population.setOfIndividual.size()];
            Quick.sort(beforeSort,0,Population.setOfIndividual.size()-1,afterSort);
            for(int j=0;j<100;j++){
                System.out.println(afterSort[j].fitness);
            }
=======
            Individual  Best = (Individual)(Population.setOfIndividual.firstElement());

>>>>>>> 07186acc76e6bff9af4752520bcce072846cda3e
            /*
            此处应有排序方法
            由大到小
            */

            //结束检测：当最大适应度变化小于0.1时终止（需要确认）
            if(Best.getFitness()-lastBestFitness<0.1)
                if(Best.getFitness()<lastBestFitness) {
                    System.out.println("适应度出现减少");
                    lastBestFitness = Best.getFitness();
                }
                else{
                    EndFenestra aallah = new EndFenestra(); //结束
                    break;
                }
            else
                lastBestFitness = Best.getFitness();


            //处♂刑所有弱子个体
            for(int i = Population.setOfIndividual.capacity()/2 -1; i< Population.setOfIndividual.size(); )
                Population.setOfIndividual.remove(i);

            //繁殖
            int reproduceSize = Population.setOfIndividual.size();
            while(Population.setOfIndividual.size()<= Population.setOfIndividual.capacity()){
                for(int i = 0;i<reproduceSize-1;i+=2){
                    Population.setOfIndividual.add(Event.reproduce((Individual) Population.setOfIndividual.get(i),(Individual) Population.setOfIndividual.get(i+1)));
                }
                reproduceSize /= 2 ;
                if(reproduceSize <= 1)//解决剩下1个个体无法繁殖的问题
                    Population.setOfIndividual.add(Event.reproduce((Individual) Population.setOfIndividual.get(0),(Individual) Population.setOfIndividual.get(1)));

            }

        }


    }
}
