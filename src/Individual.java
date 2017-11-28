public class Individual {
    public boolean gene[][] = new boolean[trait_num][len];
    /*第一维度为每一种形状
    * [n][0]表示这种形状是否表达
    * [n][1]到[n][8]表示八个基因位
    * */
    public static int len=9;//基因数量
    public static int trait_num=20;//形状数量

    public static double getMutation() {
        return mutation;
    }

    public static void setMutation(double mutation) {
        Individual.mutation = mutation;
    }

    public static double mutation=0.01;//变异几率

    public Individual(boolean[][] gene) {
        this.gene = gene;
    }
    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double fitness=0;//此个体的适应度
    public static boolean[][] getgene() {
        boolean hhh[][]=new boolean[Individual.trait_num][Individual.len];
        //随机生成基因
        return hhh;
    }
}
