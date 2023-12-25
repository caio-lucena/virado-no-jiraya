package javacore.Lclassesabstratas.dominio;

public enum LinguagemProgramacao {
    JAVA{
        @Override
        public String imprimirNome() {
            return "Java";
        }
    },
    CSHARP{
        @Override
        public String imprimirNome() {
            return "C#";
        }
    },
    PYTHON{
        @Override
        public String imprimirNome() {
            return "Python";
        }
    };

    public abstract String imprimirNome();
}
