public class Environment {
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTerrain() {
        return terrain;
    }

    public void setTerrain(int terrain) {
        this.terrain = terrain;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    int temperature;
    int humidity;
    int terrain; // 1- water, 2-land, 3-water&land
    int oxygenLevel;
    int food;//[to be finish]

    Environment(int temperature, int humidity, int terrain, int oxygenLevel, int food){
        this.temperature = temperature;
        this.humidity = humidity;
        this.terrain = terrain;
        this. oxygenLevel = oxygenLevel;
        this.food = food;
    }
    Environment(){
        this.temperature = 20;
        this.humidity = 40;
        this.terrain = 2;
        this. oxygenLevel = 20;
        this.food = 8;
    }
}
