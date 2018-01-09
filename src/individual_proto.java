public interface individual_proto {
    boolean[][] getGene();
    void mutation(boolean[][] gene);
    void die(Individual a);
}
