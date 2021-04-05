class BinarySearchTree(private var root : Node) {
    //inserting to tree with key
    fun insert(key : Int){
        root = insertRec(root,key)
    }

    //inserting to tree
    //recursive function
    private fun insertRec(_node: Node?, key: Int): Node {
        var node  = _node
        if (node == null) {
            node = Node(key)
            return node
        }
        if (key < node.key) node.left = insertRec(node.left, key)
        else if (key > node.key) node.right = insertRec(node.right, key)
        return node
    }


    //inorder function
    fun inorder(){
        inorderRec(root)
    }

    //inorder Recursive
    private fun inorderRec(_node: Node?) {
        _node?.let {
            inorderRec(_node.left)
            println(_node.key)
            inorderRec(_node.right)
        }
    }
}