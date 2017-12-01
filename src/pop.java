public class Pop {
    public Individual population[];
    public static int number;//种群数量
    public Pop(int num) {
        number=num;
        population=new Individual[number];
        for(Individual i:population) i=new Individual(Individual.getGene());
    }

}
