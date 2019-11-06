class BinarySearchTree2 { 
  
  
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  

    Node root; 
  
   
    BinarySearchTree2() {  
        root = null;  
    } 
  
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    Node insertRec(Node root, int key) { 
  
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
  
  
    void inorder()  { 
       inorderRec(root); 
    } 
		void preorder()
	{
		preorder(root);
	}
  
    void inorderRec(Node root) { 
        if (root != null) {
			inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
   }
     
	void  preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
  
    public static void main(String[] args) { 
        BinarySearchTree2 tree = new BinarySearchTree2(); 

      
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
		System.out.println("Inorder");     
        tree.inorder();
		System.out.println("Preorder");
          tree.preorder();
			  
    } 
} 
