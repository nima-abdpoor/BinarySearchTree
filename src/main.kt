

fun main(){
    val node = Node(50)
    val tree = BinarySearchTree(node)
    tree.insert(30)
    tree.insert(20)
    tree.insert(40)
    tree.insert(70)
    tree.insert(60)
    tree.insert(80)
    tree.inorder()
}