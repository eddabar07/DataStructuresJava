package Sesion19_BinarySearchTree;

class TreeNode{
    // Variable declaration
    private TreeNode leaftNodeTree;
    private int data;
    private TreeNode rigthTreeNode;

    // Constructor
    public TreeNode(int data){
        this.data = data;
    }

    // Getter's and Setter's
    public TreeNode getLeaftNodeTree() {
        return leaftNodeTree;
    }

    public void setLeaftNodeTree(TreeNode leaftNodeTree) {
        this.leaftNodeTree = leaftNodeTree;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRigthTreeNode() {
        return rigthTreeNode;
    }

    public void setRigthTreeNode(TreeNode rigthTreeNode) {
        this.rigthTreeNode = rigthTreeNode;
    }

    // toString
    @Override
    public String toString() {
        return "TreeNode [leaftNodeTree=" + leaftNodeTree + ", data=" + data + ", rigthTreeNode=" + rigthTreeNode + "]";
    }    
}

/** 
 * ABB (BST) - OPERATIONS
 * 1.- Create
 * 2.- Insert
 * 3.- Delete
 * 4.- Search
*/

class BinarySearchTree{
    // Variable declaration
    TreeNode root;

    // 1.- Create
    public BinarySearchTree(){
        root = null;
    }

    // 2.- Insert
    public void insertNode(int data){
        // Variable declaration
        TreeNode newNode = new TreeNode(data);

        if (root == null){ // Empty tree
            root = newNode;
        }
        else{ // Non empty tree

            // Declarate auxiliary Nodes
            TreeNode parentNode;
            TreeNode currentNode = root;

            while (currentNode != null){
                parentNode = currentNode;

                if(data <= currentNode.getData()){ // Leaft subTree
                    currentNode = currentNode.getLeaftNodeTree();
                    if(currentNode == null){
                        parentNode.setLeaftNodeTree(newNode);
                    }
                }else{ // Rigth subTree
                    currentNode = currentNode.getRigthTreeNode();
                    if(currentNode == null){
                        parentNode.setRigthTreeNode(newNode);
                    }
                }
            }
        }
    }

    // ---------- Recorrido del arbol ----------
    public void recorridoPreorden(TreeNode root){ // R-I-D
        if (!(root == null)){
            System.out.println(root.getData());
            recorridoPreorden(root.getLeaftNodeTree());
            recorridoPreorden(root.getRigthTreeNode());
        }
    }

    public void recorridoOrden(TreeNode root){ // I-R-D
        if (!(root == null)){
            recorridoOrden(root.getLeaftNodeTree());
            System.out.println(root.getData());
            recorridoOrden(root.getRigthTreeNode());
        }
    }

    public void recorridoPostorden(TreeNode root){ // I-D-R
        if (!(root == null)){
            recorridoPostorden(root.getLeaftNodeTree());
            recorridoPostorden(root.getRigthTreeNode());
            System.out.println(root.getData());
        }
    }

    public TreeNode reemplazar(TreeNode nodo){
		TreeNode reemplazarPadre = nodo;
		TreeNode reemplazo = nodo;
		TreeNode auxiliar = nodo.getRigthTreeNode();

		while(auxiliar != null){
			reemplazarPadre = reemplazo;
			reemplazo = auxiliar;
			auxiliar= auxiliar.getLeaftNodeTree();
		}

		if(reemplazo!=nodo.getRigthTreeNode()){
			reemplazarPadre.setLeaftNodeTree(reemplazo.getRigthTreeNode());
			reemplazo.setRigthTreeNode(nodo.getRigthTreeNode());
		}

		return reemplazo;		
	}

    //3) Eliminar
    public boolean eliminarElemento(int dato) {
		
		if(!(root==null)) {
			
			TreeNode anterior = root;
			TreeNode aux = root;
			String ladoArbol ="";
			
			//proceso de busqueda
			while(aux.getData() != dato) {
				anterior = aux;

				if(dato<=aux.getData()) { //izquierda
					aux = aux.getLeaftNodeTree();
					ladoArbol = "IZQ";
				}else{ //Derecha
					aux = aux.getRigthTreeNode();
					ladoArbol = "DER";
				}
				
				if(aux==null) {
					System.out.println("\n"+dato+ " Buscado y no encontrado");
					return false;
				}
			}
			
			System.out.println("\n" + dato + " encontrado");

			//proceso de eliminacion  (se encontro el dato)
			//Escenario 1: El nodo a eliminar es HOJA
			if(aux.getLeaftNodeTree()==null && aux.getRigthTreeNode()==null) { //verficar si es hoja
				if(aux==root)
					root = null;
				else if(ladoArbol.equals("IZQ"))
					anterior.setLeaftNodeTree(null);
				else
					anterior.setRigthTreeNode(null);

			}else if(aux.getLeaftNodeTree()==null) { //verificar si tiene un solo hijo a la IZQ
				if(aux==root)
					root = aux.getLeaftNodeTree();
				else if(ladoArbol.equals("IZQ"))
					anterior.setLeaftNodeTree(aux.getLeaftNodeTree());
				else
					anterior.setRigthTreeNode(aux.getLeaftNodeTree());

			}else if(aux.getRigthTreeNode()==null) { //verificar si tiene un solo hijo a la DER
				if(aux==root)
					root = aux.getRigthTreeNode();
				else if(ladoArbol.equals("IZQ"))
					anterior.setLeaftNodeTree(aux.getRigthTreeNode());
				else
					anterior.setRigthTreeNode(aux.getRigthTreeNode());

			}else { // de lo contrario TIENE DOS HIJOS 
				TreeNode reemplazo = reemplazar(aux);

				if(aux==root)
					root = reemplazo;
				else if(ladoArbol.equals("IZQ"))
					anterior.setLeaftNodeTree(reemplazo);
				else
					anterior.setRigthTreeNode(reemplazo);
				reemplazo.setLeaftNodeTree(aux.getLeaftNodeTree());
			}

			System.out.println("\n Elimnando.....");

			return true;
		}else {
			System.out.println("\n Arbol vacio");
			return false;
		}
	}
}

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertNode(7);
        bst.insertNode(14);
        bst.insertNode(3);
        bst.insertNode(9);
        bst.insertNode(50);
        bst.insertNode(1);

        System.out.println("========== Recorrido en PREORDEN ==========");
        bst.recorridoPreorden(bst.root);

        System.out.println("========== Recorrido en ORDEN ==========");
        bst.recorridoOrden(bst.root);

        System.out.println("========== Recorrido en POSTORDEN ==========");
        bst.recorridoPostorden(bst.root);

        System.out.println("========== Eliminar ==========");
        bst.eliminarElemento(14);
    }
}
