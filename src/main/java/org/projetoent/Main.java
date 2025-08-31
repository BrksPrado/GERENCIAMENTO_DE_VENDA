//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 19:29:58 */

package org.projetoent;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        //* Buildar projeto: ./mvnw clean package -DskipTests */
        //* Executar projeto: java -jar target/quarkus-app/quarkus-run.jar */
        Quarkus.run(TestarMeuProjeto.class, args);
    }

    @ApplicationScoped
    public static class TestarMeuProjeto implements QuarkusApplication {

        // Formatação PT/BR
        private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        private static final NumberFormat CURRENCY_FORMATTER = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        @Override
        @Transactional
        public int run(String... args) {
            
            System.out.println("\n");
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                   TRABALHO ENTIDADES - ENG. SOFTWARE                                    ║");
            System.out.println("║                                     PADRÕES DE DESENVOLVIMENTO WEB                                      ║");
            System.out.println("║                                            QUARKUS + MYSQL                                              ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

            lerCategorias();
            lerFabricantes();
            lerClientes();
            lerFuncionarios();
            lerProdutos();
            lerVendas();
            lerItensVenda();
            
            System.out.println("\n");
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                    TODOS OS DADOS EXIBIDOS COM SUCESSO!                                 ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

            return 0;
        }

        private void lerCategorias() {
            System.out.println("\n");
            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                 CATEGORIAS                                 ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────────┬─────────────────────────────────────────────────────────────┐");
            System.out.println("│    CÓDIGO    │                         NOME                                │");
            System.out.println("├──────────────┼─────────────────────────────────────────────────────────────┤");
            
            List<Categoria> categorias = Categoria.listAll();
            categorias.forEach(cat -> 
                System.out.printf("│ %-12s │ %-59s │%n", 
                    cat.codigo, cat.nome));
            
            System.out.println("└──────────────┴─────────────────────────────────────────────────────────────┘");
            System.out.printf("TOTAL: %d registros%n", categorias.size());
        }

        private void lerFabricantes() {
            System.out.println("\n");
            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                FABRICANTES                                 ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────────┬─────────────────────────────────────────────────────────────┐");
            System.out.println("│    CÓDIGO    │                         NOME                                │");
            System.out.println("├──────────────┼─────────────────────────────────────────────────────────────┤");
            
            List<Fabricante> fabricantes = Fabricante.listAll();
            fabricantes.forEach(fab -> 
                System.out.printf("│ %-12s │ %-59s │%n", 
                    fab.codigo, fab.nome));
            
            System.out.println("└──────────────┴─────────────────────────────────────────────────────────────┘");
            System.out.printf("TOTAL: %d registros%n", fabricantes.size());
        }

        private void lerClientes() {
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                      CLIENTES                                     ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────────┬─────────────────────────────────────────────┬──────────────────────┐");
            System.out.println("│    CÓDIGO    │                    NOME                     │         CPF          │");
            System.out.println("├──────────────┼─────────────────────────────────────────────┼──────────────────────┤");
            
            List<Cliente> clientes = Cliente.listAll();
            clientes.forEach(cli -> 
                System.out.printf("│ %-12s │ %-43s │ %-20s │%n", 
                    cli.codigo, cli.nome, cli.cpf));
            
            System.out.println("└──────────────┴─────────────────────────────────────────────┴──────────────────────┘");
            System.out.printf("TOTAL: %d registros%n", clientes.size());
        }

        private void lerFuncionarios() {
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                   FUNCIONÁRIOS                                    ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────────┬─────────────────────────────────────────────┬──────────────────────┐");
            System.out.println("│    CÓDIGO    │                    NOME                     │         CPF          │");
            System.out.println("├──────────────┼─────────────────────────────────────────────┼──────────────────────┤");
            
            List<Funcionario> funcionarios = Funcionario.listAll();
            funcionarios.forEach(func -> 
                System.out.printf("│ %-12s │ %-43s │ %-20s │%n", 
                    func.codigo, func.nome, func.cpf));
            
            System.out.println("└──────────────┴─────────────────────────────────────────────┴──────────────────────┘");
            System.out.printf("TOTAL: %d registros%n", funcionarios.size());
        }

        private void lerProdutos() {
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                             PRODUTOS                                              ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────┬──────────────────────┬──────────────┬─────┬──────────────┬──────────────┬──────────────┐");
            System.out.println("│  CÓDIGO  │         NOME         │     PREÇO    │ QTD │   VALIDADE   │  CATEGORIA   │  FABRICANTE  │");
            System.out.println("├──────────┼──────────────────────┼──────────────┼─────┼──────────────┼──────────────┼──────────────┤");
            
            List<Produto> produtos = Produto.listAll();
            produtos.forEach(prod -> 
                System.out.printf("│ %-8s │ %-20s │ %-12s │ %3d │ %-12s │ %-12s │ %-12s │%n", 
                    prod.codigo, prod.nome, CURRENCY_FORMATTER.format(prod.preco), prod.quantidade, 
                    prod.validade != null ? prod.validade.format(DATE_FORMATTER) : "N/A",
                    prod.categoria.nome, prod.fabricante.nome));
            
            System.out.println("└──────────┴──────────────────────┴──────────────┴─────┴──────────────┴──────────────┴──────────────┘");
            System.out.printf("TOTAL: %d registros%n", produtos.size());
        }

        private void lerVendas() {
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                      VENDAS                                       ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────┬─────────────────────┬──────────────┬─────────────────┬─────────────────┐");
            System.out.println("│  CÓDIGO  │     DATA/HORA       │ VALOR TOTAL  │     CLIENTE     │   FUNCIONÁRIO   │");
            System.out.println("├──────────┼─────────────────────┼──────────────┼─────────────────┼─────────────────┤");
            
            List<Venda> vendas = Venda.listAll();
            vendas.forEach(venda -> 
                System.out.printf("│ %-8s │ %s │ %-12s │ %-15s │ %-15s │%n", 
                    venda.codigo, venda.horario.format(DATETIME_FORMATTER), CURRENCY_FORMATTER.format(venda.valorTotal), 
                    venda.cliente.nome, venda.funcionario.nome));
            
            System.out.println("└──────────┴─────────────────────┴──────────────┴─────────────────┴─────────────────┘");
            System.out.printf("TOTAL: %d registro%n", vendas.size());
        }

        private void lerItensVenda() {
            System.out.println("\n");
            System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                           ITENS DA VENDA                            ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
            System.out.println("┌──────────┬──────────────────────┬─────┬────────────────┬────────────┐");
            System.out.println("│  CÓDIGO  │       PRODUTO        │ QTD │ VALOR PARCIAL  │   VENDA    │");
            System.out.println("├──────────┼──────────────────────┼─────┼────────────────┼────────────┤");
            
            List<ItemVenda> itens = ItemVenda.listAll();
            itens.forEach(item -> 
                System.out.printf("│ %-8s │ %-20s │ %3d │ %-14s │ %-10s │%n", 
                    item.codigo, item.produto.nome, item.quantidadeParcial, 
                    CURRENCY_FORMATTER.format(item.valorParcial), item.venda.codigo));
            
            System.out.println("└──────────┴──────────────────────┴─────┴────────────────┴────────────┘");
            System.out.printf("TOTAL: %d registros%n", itens.size());
        }
    }
}
