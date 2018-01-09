import java.util.Vector;

public class Population {
    static Vector setOfIndividual = new Vector();

    //public Individual population[];
    public static int number;//种群数量
    public Population(int num) {//初始化种群
        /*number=num;
        population=new Individual[number];
        for(Individual i:population) i=new Individual(Individual.getGene());*/
        for(int i = 0; i<num;i++)//创建num个个体
            Population.setOfIndividual.addElement(new Individual());
    }

}
