public class Event {

    public Individual reproduce(Individual a, Individual b){//繁殖方法：杂交两个个体
        //int swichPoint = (int)(Math.random()*20);

        Individual newSon = new Individual(Individual.getGene());

        for  (int i = 0; i<newSon.gene.length; i++){
           double choose = Math.random();
            if(choose>=0.5)
                newSon.gene[i]=a.gene[i];
            else
                newSon.gene[i]=b.gene[i];
        }
        /*对每个基因随机选择组合*/

        //废弃代码
        //System.arraycopy(a.gene,0,newSon.gene,0,swichPoint);
        //System.arraycopy(b.gene,swichPoint,newSon.gene,swichPoint,b.gene.length - swichPoint-1);

        return newSon;
    }
}
