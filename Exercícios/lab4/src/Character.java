import java.util.Random;

public class Character {
    private String name;
    private String job;
    private String equipment;
    private int intelligence;
    private int strength;
    private int speed;
    private int health;

    private Character(String name, String job, String equipment, int intelligence, int strength, int speed, int health) {
        this.name = name;
        this.job = job;
        this.equipment = equipment;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.health = health;
    }

    public static class CharacterBuilder
    {
        private String name;
        private String job;
        private String equipment;
        private int intelligence;
        private int strength;
        private int speed;
        private int health;

        public CharacterBuilder name(String name)
        {
            this.name = name;
            return this;
        }

        public CharacterBuilder job(String job)
        {
            this.job = job;
            return this;
        }

        public CharacterBuilder equipment(String equipment)
        {
            this.equipment = equipment;
            return this;
        }

        public CharacterBuilder intelligence(int intelligence)
        {
            this.intelligence = intelligence;
            return this;
        }

        public CharacterBuilder speed(int speed)
        {
            this.speed = speed;
            return this;
        }

        public CharacterBuilder strength(int strength)
        {
            this.strength = strength;
            return this;
        }

        public CharacterBuilder health(int health)
        {
            this.health = health;
            return this;
        }

        public CharacterBuilder randomAtributes() {
            Random random = new Random();

            this.intelligence = random.nextInt(100) + 1;
            this.strength = random.nextInt(100) + 1;
            this.speed = random.nextInt(100) + 1;
            this.health = random.nextInt(100) + 1;

            return this;
        }

        public Character build()
        {
            return new Character(name, job, equipment, intelligence, strength, speed, health);
        }
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEquipment() {
        return equipment;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public float GetMediaAtributos()
    {
        return  (float) (intelligence + strength + speed + health)/4;
    }

    //exercício 2
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", equipment='" + equipment + '\'' +
                ", intelligence=" + intelligence +
                ", strength=" + strength +
                ", speed=" + speed +
                ", health=" + health +
                '}';
    }
}
