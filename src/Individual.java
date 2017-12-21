import java.util.Random;

public class Individual {
    public boolean gene[][] = new boolean[trait_num][len];
    /*第一维度为每一种性状
    * [n][0]表示这种形状是否表达
    * [n][1]到[n][8]表示八个基因位
    * */
    public static int len=3;//基因数量
    public static int trait_num=6;//性状数量

    public Individual(boolean[][] gene) {
        this.gene = gene;
    }
    public Individual(){}
    //get、set方法

    public static double getMutation() {
        return mutation;
    }
    public static void setMutation(double mutation) {
        Individual.mutation = mutation;
    }
    public double getFitness() {
        return fitness;
    }
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
//get、set结束


    public static double mutation=0.01;//变异几率
    public double fitness=0;//此个体的适应度
    static Random ran=new Random();

    public static boolean[][] getGene() {//随机生成基因
        boolean hhh[][]=new boolean[Individual.trait_num][Individual.len];


        for(int i = 0;i<hhh.length;i++){
            for (int j = 0; j<hhh[0].length;j++){
                    hhh[i][j]=ran.nextBoolean();
            }
        }
/*
for (boolean[] x:hhh) {
for (boolean y:x) {
y = ran.nextBoolean();
}
}
*/
        return hhh;
    }
    public static void mutation(boolean[][] gene) {//变异方法
        for(int i = 0;i<gene.length;i++){
            for(int j = 0;j<gene[0].length;j++)
                if(ran.nextDouble()<mutation)
                    gene[i][j] ^= true;
        }
    }
    public static void die(Individual a){//自杀
        pop.setOfIndividual.remove(a);
    }//清除个体
}
