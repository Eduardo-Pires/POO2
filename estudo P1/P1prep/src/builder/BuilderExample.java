package P1prep.src.builder;

public class BuilderExample {
    String nome;
    int num;

    private BuilderExample(String nome, int num) {
        this.nome = nome;
        this.num = num;
    }

    public class BuilderOfBuilderExample
    {
        String nome;
        int num;

        public BuilderOfBuilderExample createNome(String nome)
        {
            this.nome = nome;
            return this;
        }

        public BuilderOfBuilderExample createNum(int num)
        {
            this.num = num;
            return this;
        }

        public BuilderExample getBuilder()
        {
            return new BuilderExample(this.nome, this.num);
        }

    }


}
