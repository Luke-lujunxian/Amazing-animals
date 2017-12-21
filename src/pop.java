import java.util.Vector;

public class pop{
    static Vector setOfIndividual = new Vector();

    public Individual population[];
    public static int number;//种群数量
    public pop(int num) {//初始化种群
        /*number=num;
        population=new Individual[number];
        for(Individual i:population) i=new Individual(Individual.getGene());*/
        for(int i = 0; i<num;i++)//创建num个个体
            pop.setOfIndividual.addElement(new Individual());
    }

}
