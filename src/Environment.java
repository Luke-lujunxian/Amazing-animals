public class Environment {
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if(temperature>=-60&&temperature<=100)this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
       if(humidity>=0&&humidity<=100) this.humidity = humidity;
    }

    public int getTerrain() {
        return terrain;
    }

    public void setTerrain(int terrain) {
        if(terrain>=1 && terrain<=3)this.terrain = terrain;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        if(oxygenLevel>=0 && oxygenLevel<=40)this.oxygenLevel = oxygenLevel;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if(food>=1&&food<=8)this.food = food;
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
