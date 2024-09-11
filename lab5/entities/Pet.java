package lab5.entities;

public class Pet {
    private int id;
    private static int autoId;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private PetType TYPE;
    private String images;

    public Pet(String name, String species, int age, String sex, String description, PetType TYPE, String images) {
        this.id = autoId++;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.TYPE = TYPE;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PetType getTYPE() {
        return TYPE;
    }

    public void setTYPE(PetType TYPE) {
        this.TYPE = TYPE;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", TYPE=" + TYPE +
                ", images='" + images + '\'' +
                '}';
    }
}
