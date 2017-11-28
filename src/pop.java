public class pop {
    public Individual population[];
    public static int number;//种群数量
    public pop(int num) {
        number=num;
        population=new Individual[number];
        for(Individual i:population) i=new Individual(Individual.getgene());
    }

}
