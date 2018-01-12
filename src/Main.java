public class Main {
     public static void fitness(Individual a) {//适应度函数
            int j[]=decode(a.gene);
            a.fitness = 1-Math.abs(j[0]-dlt.getOxygenLevel())*0.005-Math.abs(j[1]-dlt.getHumidity())*0.01-Math.abs(j[2]-dlt.getFood())*0.1-Math.abs(j[3]-dlt.getTemperature())*0.01+0.1*j[4]+0.1*j[5];
     }
     public static int[] decode(boolean[][] a) {//解码
         int[] h=new int[a.length];
         for(int i=0;i<a.length;i++){
             int j=0;
             for(int k=0;k<a[i].length;k++) if(a[i][k]) if(k>0) j+=2*k; else j+=1;
             switch (i) {
                 case 0:
                     continue;
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
    public static void main(String args[]){//主方法
        //Set up population
        dlt=new Environment();
        Fenestra allah = new Fenestra(dlt);
        while(Fenestra.connection==0){
       }
        System.out.print("djhbsad");
        pop = new Population(100);
        double lastBestFitness = 0.0;
        while(true){

            //计算适应度
            for (int i = 0; i< Population.setOfIndividual.size(); i++){
                fitness((Individual) Population.setOfIndividual.get(i));
            }

            //排序
            //Individual  temp = (Individual)(Population.setOfIndividual.firstElement());
            Individual[] beforeSort=new Individual[Population.setOfIndividual.size()];
            for(int i=0;i<Population.setOfIndividual.size();i++){
                beforeSort[i]=(Individual) Population.setOfIndividual.get(i);
            }
            Individual[] afterSort=new Individual[Population.setOfIndividual.size()];
            Quick.sort(beforeSort,0,Population.setOfIndividual.size()-1,afterSort);
            for(int j=0;j<afterSort.length;j++){
                System.out.println(afterSort[j].fitness);
            }
            //赋值给原Vector
            Population.setOfIndividual.clear();
            for (Individual a : afterSort)
                Population.setOfIndividual.add(a);

            //结束检测：当最大适应度变化小于0.01时终止（需要确认）
            Individual  Best = (Individual)(Population.setOfIndividual.lastElement());
            if(Best.getFitness()-lastBestFitness<0.001)
                if(Best.getFitness()<lastBestFitness) {
                    System.out.println("**适应度出现减少");
                    lastBestFitness = Best.getFitness();
                    System.out.println("一代结束————————————");
                     EndFenestra aallsah = new EndFenestra("**适应度出现减少","一代结束"); 
                     

                }
                else{
                    boolean[][] a=Best.getGene();
                    int[] bestGene=new int[a.length];
                    for(int i=0;i<a.length;i++) {
                        if(a[i][0]) bestGene[i]+=1;
                        if(a[i][1]) bestGene[i]+=2;
                        if(a[i][2]) bestGene[i]+=4;
                    }
                    int b=0;
                    for(int i:bestGene) b+=i;
                    System.out.print(b);
                    
                    double z = Best.getFitness();
                    System.out.println("流程结束");
                    EndFenestra aallah = new EndFenestra("流程结束",z,b); //结束
                    break;
                }
            else{
                lastBestFitness = Best.getFitness();
                System.out.println("一代结束————————————");
                EndFenestra aawllsah = new EndFenestra("流程进行中","一代结束"); 
            }


            //处♂刑所有弱子个体
            for(int i = Population.setOfIndividual.capacity()/2 -1; i< Population.setOfIndividual.size(); )
                Population.setOfIndividual.remove(0);

            //繁殖
            int reproduceSize = Population.setOfIndividual.size();
            while(Population.setOfIndividual.size() < Population.setOfIndividual.capacity() && reproduceSize!=0){
                for(int i = 0;i<reproduceSize-1;i+=2){
                    Population.setOfIndividual.add(Event.reproduce((Individual) Population.setOfIndividual.get(i),(Individual) Population.setOfIndividual.get(i+1)));
                }
                reproduceSize /= 2 ;
                if(reproduceSize <= 1)//解决剩下1个个体无法繁殖的问题
                    Population.setOfIndividual.add(Event.reproduce((Individual) Population.setOfIndividual.get(Population.setOfIndividual.size()-1),(Individual) Population.setOfIndividual.get(Population.setOfIndividual.size()-2)));

            }

        }


    }
}
