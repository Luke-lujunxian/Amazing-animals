public class Main {
     public static double fitness(Individual a) {//适应度函数
            int j[]=decode(a.gene);
            a.fitness = 1-Math.abs(Environment.need_oxy_all[j[0]] - Environment.env_oxy_all[dlt.getOxygenLevel()])*0.005-Math.abs(Environment.need_moi_all[j[1]]-Environment.env_moi_all[dlt.getHumidity()])*0.01-Math.abs(j[2]-dlt.getFood())*0.1-Math.abs(j[3]-dlt.getTemperature())*0.01+0.01*j[4]+0.01*j[5];
            return a.fitness;//临时修改
     }
     public static int[] decode(boolean[][] a) {//解码
         int[] h=new int[a.length];
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++) {
                 if(a[i][j]) {
                     if(j==0) h[i]+=1;
                     else h[i]+=j*2;
                 }
             }
         }
         return h;
    }
    private static Population pop;
    private static Environment dlt;
    public static int generationNumber=0;
    public static void main(String args[]){//主方法
        //Set up population
        dlt=new Environment();
        Fenestra allah = new Fenestra(dlt);
        while(Fenestra.connection==0){
       }
        pop = new Population(100);
        double lastBestFitness = 0.0;
        while(true){

            //计算适应度
            for (int i = 0; i< Population.setOfIndividual.size(); i++){
                if(fitness((Individual) Population.setOfIndividual.get(i))<0)
                    Population.setOfIndividual.remove(i);//去除适应度小于0个体

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
            if(Best.getFitness()-lastBestFitness<0.01)
                if(Best.getFitness()<lastBestFitness) {
                    System.out.println("**适应度出现减少");
                    lastBestFitness = Best.getFitness();
                    generationNumber++;
                    System.out.println("第"+generationNumber+"代结束————————————\n");
                     EndFenestra aallsah = new EndFenestra("**适应度出现减少","一代结束"); 
                     

                }
                else{
                    int[] bestGene=Main.decode(Best.getGene());
                    int b=0;
                    for(int i:bestGene) b=b*10+i;
                    generationNumber++;
                    System.out.println("第"+generationNumber+"代结束————————————\n");
                    System.out.println("最好的基因："+b);
                    System.out.println();


                    System.out.println("需氧量："+Environment.need_oxy_all[bestGene[0]]);
                    System.out.println("湿度要求："+Environment.need_moi_all[bestGene[1]]);
                    System.out.println("食物需求："+Environment.need_food_all[bestGene[2]]);
                    System.out.println("温度需求："+Environment.need_tem_first_all[bestGene[3]]+"-"+Environment.need_tem_second_all[bestGene[3]]);
                    System.out.println("速度："+bestGene[4]);
                    System.out.println("耐力："+bestGene[5]);

                    System.out.println();
                    double z = Best.getFitness();
                    System.out.println("流程结束");
                    EndFenestra aallah = new EndFenestra("流程结束",z,b); //结束
                    break;
                }
            else{
                lastBestFitness = Best.getFitness();
                generationNumber++;
                System.out.println("第"+generationNumber+"代结束————————————\n");
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
