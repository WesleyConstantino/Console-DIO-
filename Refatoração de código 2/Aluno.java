package com.company;

class Aluno{
    private String nome, nome_curso, nível_curso;
    private int cod_matricula, ano_finalização;
    private boolean é_bolsista, curso_finalizado, tem_trabalho;
    private double mensalidade_curso, desconto;
    private String dados_tcc [] = new String [7];
    //[título do trabalho, nome do orientador, nota do trabalho, membros da banca (até 4)]
    public Aluno(String nome,
                 String nome_curso,
                 String nível_curso,
                 int cod_matricula,
                 boolean é_bolsista,
                 boolean curso_finalizado,
                 boolean tem_trabalho,
                 int ano_finalização,
                 double mensalidade_curso,
                 double desconto,
                 String dados_tcc[]) {
        this.nome = nome;
        this.nome_curso = nome_curso;
        this.nível_curso = nível_curso;
        this.cod_matricula = cod_matricula;
        this.é_bolsista = é_bolsista;
        this.curso_finalizado = curso_finalizado;
        this.tem_trabalho = tem_trabalho;
        this.ano_finalização = ano_finalização;
        this.mensalidade_curso = mensalidade_curso;
        this.desconto = desconto;
        this.dados_tcc = dados_tcc;
    }
    public String getMensalidade()
    {
        String resp="";
        if (this.é_bolsista)
        {
            resp += "Bolsista com desconto de: " + this.desconto + "%\n";
            this.mensalidade_curso *= (1-this.desconto/100);
        }
        resp += "Mensalidade: R$ " + this.mensalidade_curso + "\n";
        return resp;
    }

    public String statusCurso()
    {
        String resp = "";
        if (this.curso_finalizado) {
            resp += "Curso finalizado em " + ano_finalização + "\n";
            if (this.tem_trabalho) {
                resp += "Título ";
                switch (nível_curso) {
                    case "Graduação":
                        resp += "do TCC: ";
                        break;
                    case "Lato sensu":
                        resp += "da monografia: ";
                        break;
                    case "Mestrado":
                        resp += "da dissertação: ";
                        break;
                    case "Doutorado":
                        resp += "da tese: ";
                        break;
                }
                resp += dados_tcc[1] + "\n";
                resp += "Orientador(a): Prof. " + dados_tcc[0] + "\n";
                if (this.nível_curso.equals("Graduação"))
                    resp += "Nota: " + dados_tcc[2];
                else if (this.nível_curso.equals("Mestrado") || this.nível_curso.equals("Doutorado")) {
                    resp += "Banca: " + dados_tcc[3] + " - " + dados_tcc[4];
                    if (this.nível_curso.equals("Doutorado"))
                        resp += dados_tcc[5] + " - " + dados_tcc[6];
                }
            }
        }
        return resp;
    }


    public String getDados()
    {
        return  "Aluno: "+ this.nome +"\n"
        + "Curso: " + this.nível_curso + " em " + this.nome_curso +"\n"
        + this.getMensalidade()
        + this.statusCurso();
    }
}
