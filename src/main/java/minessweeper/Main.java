package minessweeper.utilitarios;

import jadex.base.Starter;

/**
 * Classe de bootstrap da plataforma Jadex.
 * Inicia o Jadex, abre o GUI padrão do Jadex,
 * e carrega automaticamente os três agentes do jogo.
 */
public class Main {
    
    public static void main(String[] args) {
        /*
         * Starter.main(...)
         *  -> GUI true         => abre a janela de controle do Jadex
         *  -> agents ...       => carrega agentes na inicialização
         *  -> agents ...
         *
         * Formato do -agents:
         *   -agents agente1,agente2,...
         * 
         * Onde cada agente pode ser:
         *   1) Classe Java de um agente (Agent)
         *   2) Arquivo XML do agente (agent.xml ou .class)path
         *
         * Aqui usamos o caminho relativo ao .agent.xml em src/main/resources/jadex.
         */
        
        Starter.main(new String[]{
            "-gui", "true",
            "-agents",
            "jadex/environment.agent.xml," + // REVERTIDO PARA PONTO
            "jadex/ia.agent.xml," +          // REVERTIDO PARA PONTO
            "jadex/monitor.agent.xml"        // REVERTIDO PARA PONTO
        });
    }
}
