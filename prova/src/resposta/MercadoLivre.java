package resposta;

import java.util.ArraysList;
import java.util.List;

public class MercadoLivre {
     
	 private Produto[] produtos;
	 private int contador;
	 private int i;
	 
	 public MercadoLivre() {
		List<produtos>list= new ArrayList <Produto>();
		 
	 }
	 
	 public void adicionarProduto(double preco, String nome, String vendedor, 
			 Data dataAnuncio, double kmEntrega) {
		 this.adicionarProduto(new Produto(preco, nome, vendedor, dataAnuncio, kmEntrega));	 
	 }
	 
	 public int getQuantidadeProdutos() {
		 return contador;
	 }
	 
	 public Produto[] getProdutosVendedor(String vendedor) {
		 int qtd = 0;
		 for (int i = 0; i<produtos.length;i++);{
			 Produto produto = produtos[i];
			 if(produto.getVendedor().equals(vendedor)) {
				 qtd++;
			 }
		 }
		 if (qtd ==0){
			 return null;
		 }
		 
		 Produto[] arrayDeRetorno = new Produto[qtd];
		 
		 int contador = 0;
		 for (int i=0; i<produtos.length;i++) {
			 Produto produto = produtos[i];
			 if(produto.getVendedor().equals(vendedor)) {
				 arrayDeRetorno[contador] = produto;
				 contador++;
			 }
			 
		 }
		 return arrayDeRetorno;
	 }
	 public double getCustoProdutos() {
	        double acumulador = 0.0;
	        for (int i = 0; i <= produtos.length; i++) {
	            Produto produto = produtos[i];
	            acumulador += produto.getPreco();
	        }

	        return acumulador;
	    }

	    public Produto removeProdutoMaisAntigo(String vendedor) {
	        Produto[] produtosVendedor = getProdutosVendedor(vendedor);

	        Produto produtoMaisAntigo = null;
	        for (int i = 0; i < produtosVendedor.length; i++) {
	            Produto produto = produtosVendedor[i];
	            if (ehMaisAntigo(produto, produtoMaisAntigo)) {
	                produtoMaisAntigo = produto;
	            }
	        }

	        removerProduto(produtoMaisAntigo);

	        return produtoMaisAntigo;
	    }

	    public void removerProduto(Produto produto) {
	        int index = acharIndexDoProduto(produto);
	        for (int i = index; i < produtos.length; i++) {
	            produtos[i] = produtos[i + 1];
	        }
	        contador--;
	    }

	    public int acharIndexDoProduto(Produto produto) {
	        for (int i = 0; i < produtos.length; i++) {
	            if (produtos[i].equals(produto)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    private boolean ehMaisAntigo(Produto produto, Produto produtoMaisAntigo) {
	        Data dataProduto = produto.getDataVenda();
	        Data maisAntiga = produtoMaisAntigo.getDataVenda();

	        if (dataProduto.getAno() < maisAntiga.getAno()) {
	            return true;
	        }

	        if (dataProduto.getMes() < maisAntiga.getMes()) {
	            return true;
	        }

	        if (dataProduto.getDia() < maisAntiga.getDia()) {
	            return true;
	        }

	        return false;
	    }


	    @Override
	    public String toString() {
	        return "MercadoLivre{" +
	                "produtos=" + Arrays.toString(produtos) +
	                ", contador=" + contador +
	                '}';
	    }
	}
 






