public class pop {
    public Individual population[];
    public static int number;//种群数量
    public pop(int num) {//初始化种群
        number=num;
        population=new Individual[number];
        for(Individual i:population) i=new Individual(Individual.getGene());
    }

}
