class BinarySearchTree(private var root : Node) {
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
    fun insert(key : Int){
        root = insertRec(root,key)
    }
    fun inorder(){
        inorderRec(root)
    }

    private fun inorderRec(_node: Node?) {
        _node?.let {
            inorderRec(_node.left)
            println(_node.key)
            inorderRec(_node.right)
        }
    }
}