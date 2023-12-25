package javacore.Lclassesabstratas.dominio;

public enum BancoDeDados {
    MSSQL{
        @Override
        public String imprimirNome() {
            return "MSSQL";
        }
    },
    MYSQL{
        @Override
        public String imprimirNome() {
            return "MySQL";
        }
    },
    POSTGRESQL{
        @Override
        public String imprimirNome() {
            return "PostgreSQL";
        }
    },
    MONGODB{
        @Override
        public String imprimirNome() {
            return "MongoDB";
        }
    };

    public abstract String imprimirNome();
}
