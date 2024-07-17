package at.campus02.AlgorithmenDatenstrukturen.INSERT;

public class INSERT {

    //DOUBLELINKED LIST REMOVE ANY POSITION
    /*
   public void deleteAtPosition(int position) {
    if (first == null) {
        return;
    }

    Node current = first;

    if (position == 0) {

        if (first == last) {

            first = null;
            last = null;
        } else {
            first = first.getNext();
            if (first != null) {
                first.setPrev(null);
            }
        }
    } else {

        for (int i = 0; i < position; i++) {
            if (current.getNext() == null) {
                return;
            }
            current = current.getNext();
        }

        Node nodeToDelete = current;
        if (nodeToDelete == null) {
            return;
        }

        Node predecessorNode = nodeToDelete.getPrev();
        Node followingNode = nodeToDelete.getNext();

        if (predecessorNode != null) {
            predecessorNode.setNext(followingNode);
        }

        if (followingNode != null) {
            followingNode.setPrev(predecessorNode);
        }

        if (nodeToDelete == last) {
            last = predecessorNode;
        }

        nodeToDelete.setPrev(null);
        nodeToDelete.setNext(null);
    }
}



    //DOUBLELINKED LIST SWAP
    public void swapAdjacentNodes(int position) {
        if (first == null || first.getNext() == null) {
            return; // Liste ist leer oder hat nur einen Knoten
        }

        if (position < 0) {
            return; // Ungültige Position
        }
        Node current = first;
        for (int i = 0; i < position; i++) {
            if (current.getNext() == null || current.getNext().getNext() == null) {
                return; // nicht in der liste tauschen geht nicht!
            }
            current = current.getNext();
        }

        Node firstNode = current;
        Node secondNode = current.getNext();

        // Aktualisiere die Referenzen der Vorgänger und Nachfolger
        if (firstNode.getPrevious() != null) {
            firstNode.getPrevious().setNext(secondNode);
        } else {
            first = secondNode; // secondNode wird das neue erste Element
        }

        if (secondNode.getNext() != null) {
            secondNode.getNext().setPrevious(firstNode);
        } else {
            last = firstNode; // firstNode wird das neue letzte Element
        }

        firstNode.setNext(secondNode.getNext());
        secondNode.setPrevious(firstNode.getPrevious());
        firstNode.setPrevious(secondNode);
        secondNode.setNext(firstNode);
    }
    */
    // -----------------------------------------------------------------

    //HASHTABLE MIT LISTE
    /*
    private LinkedList<Book>[] list;
    public HashFunktionMitListe(int size) {
        list=new LinkedList[size];
    }
    //HASHTABLE ADD MIT LISTE
    public boolean addObject(Book newBook)
    {
        int listIndex= getIndexByHashCalc(newBook.getId());
        if(list[listIndex]==null){
            list[listIndex]=new LinkedList<Book>();
        }
        return list[listIndex].add(newBook);
    }
    //HASHTABLE SEARCH MIT LISTE
    public Book getBookById(int id)
    {
        Book currentBook;
        LinkedList<Book> linkedList = list[getIndexByHashCalc(id)];
        Iterator it = linkedList.iterator();
        while (it.hasNext())
        {
            currentBook = (Book)it.next();
            if (currentBook.getId() == id)
                return currentBook;
        }

        return null;
    }
    //HASHTABLE REMOVE MIT LISTE
    public boolean removeBook(int id)
    {
        Book book = getBookById(id);
        if (book == null)
            return false;

        int listIndex = getIndexByHashCalc(book.getId());
        LinkedList<Book> linkedList = list[listIndex];
        return linkedList.remove(book);
    }

    public LinkedList<Book> getLinkedListAtPos(int pos)
    {

        return list[pos];

    }

    private int getIndexByHashCalc(int id)
    {

        return id % list.length;

    }
}
*/
//---------------------------------------------------------------
    //GRAPH ADD REMOVE
    /*
        public void addEdge(int fromVertex, int toVertex) {
            graph[fromVertex].add(new Edge(fromVertex, toVertex));
            if (!directed) {
                graph[toVertex].add(new Edge(toVertex, fromVertex));
            }
        }

    private Edge findEdge(int fromVertex, int toVertex) {
        for (Edge edge : graph[fromVertex]) {
            if (edge.toVertex == toVertex) {
                return edge;
            }
        }
        return null;
    }

    public void removeEdge(int fromVertex, int toVertex) {
        graph[fromVertex].remove(findEdge(fromVertex, toVertex));
        if (!directed) {
            graph[toVertex].remove(findEdge(toVertex, fromVertex));
        }
    }

    public boolean addEdge(int from, int to) {
        if ((from >= size) || (to >= size))
            return false;

        graph[from][to] = 1;
        graph[to][from] = 1;
        return true;
    }
*/
    //-----------------------------------------------------------
    //DOCTORWAITINGLIST
    /*
        public void addPatientAtLastPos(String name, String socialSecurityNo) {

            Node newNode=new Node(name,socialSecurityNo);
            if(last==null){
                first=newNode;
                last=newNode;
            } else{
                newNode.setPrev(last);
                last.setNext(newNode);
                last=newNode;
            }
        }
*/
//----------------------------------------------------------------
    /*//SORTCARD
    public void sortDeck() {

        //wenn farbe und nummer gleich sind
        for (int i = 0; i < deck.length - 1; i++) {
            for (int j = 0; j < deck.length - i - 1; j++) {
                if (deck[j].getColor().compareTo(deck[j + 1].getColor()) > 0) {
                    Card temp = deck[j];
                    deck[j] = deck[j + 1];
                    deck[j + 1] = temp;
                } else if (deck[j].getColor().compareTo(deck[j + 1].getColor()) == 0 && (deck[j].getNumber() > deck[j + 1].getNumber()))
                {
                    Card temp = deck[j];
                    deck[j] = deck[j + 1];
                    deck[j + 1] = temp;
                }
            }

        }
    }
    */
    //------------------------------------------------------
    /*
    //TREE RECURSIVEEMPLOYEE
    public Employee searchForNumber(int number) {

       return searchForNumberRecursive(root,number);

    }


    private Employee searchForNumberRecursive(Node currentNode, int number) {
        if (currentNode == null) {
            return null; // Employee not found
        }

        if (number == currentNode.getEmployee().getNumber()) {
            return currentNode.getEmployee(); // Employee found
        } else if (number < currentNode.getEmployee().getNumber()) {
            return searchForNumberRecursive(currentNode.getLeft(), number);
        } else {
            return searchForNumberRecursive(currentNode.getRight(), number);
        }
    }
     */
    //-------------------------------------------------
    /*
    //BREITENSUCHE LIST<INTEGER>
    public List<Integer> performBreadthSearch(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {

            int currentVertex = queue.remove();

            if (!visited.contains(currentVertex)) {
                visited.add(currentVertex);
                for (Edge e : graph[currentVertex]) {
                    queue.add(e.toVertex);
                }
            }
        }
        return visited;
    }
     */
    //-----------------------------------------------------
    /*
      //SORT
    public void bubbleSort(Dummy[] dummy) {

        boolean swapped;
        for (int i = 0; i < dummy.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < dummy.length - i - 1; j++) {
                if (dummy[j].getId() < dummy[j + 1].getId()) {
                    Dummy temp = dummy[j];
                    dummy[j] = dummy[j + 1];
                    dummy[j + 1] = temp;
                }
            }
            if (!swapped)
                break;
        }
    }
    public void InsertionSort(Dummy[] dummy){

        for (int i = 1; i < dummy.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (dummy[j].getId() < dummy[j-1].getId()) {
                    Dummy temp=dummy[j];
                    dummy[j]=dummy[j-1];
                    dummy[j-1]=temp;
                }
            }
        }
    }
     */
    //------------------------------------------------
    /*
        //HASHTABLE ADDSEARCHDELETE
    private static final String TOMBSTONE = "####12345####++++----";
    private String[] list;
    private LinkedList<String>[] linkedList;

    public Hashtable(int size) {
        this.list = new String[size];
        this.linkedList = new LinkedList[size];
    }

    public void addWithquadraticHashing(String element) {
        int baseValue = Math.abs(element.hashCode());

        for (int i = 0; i < list.length; i++) {
            int pos = (baseValue + i * i) % list.length;
            if (list[pos] == null || list[pos].equals(TOMBSTONE)) {
                list[pos] = element;
                break;
            }
        }
    }
    public void addWithDoubleHashing(String element) {
        int baseValue = Math.abs(element.hashCode());
        int h1 = baseValue % list.length;
        int h2 = baseValue % 31 + 12;
        for (int i = 0; i < list.length; i++) {
            int pos = (h1 + (i * h2)) % list.length;
            if (list[pos] == null || list[pos].equals(TOMBSTONE)) {
                list[pos] = element;
                break;
            }
        }
    }
    public boolean searchWithQuadraticHashing(String element) {
        int baseValue = Math.abs(element.hashCode());

        for (int i = 0; i < list.length; i++) {
            int pos = (baseValue + i * i) % list.length;
            if (list[pos] != null && element.equals(list[pos])) {
                return true;
            }
        }
        return false;
    }

    public boolean searchWithDoubleHashing(String element) {
        int baseValue = Math.abs(element.hashCode());
        int h1 = baseValue % list.length;
        int h2 = baseValue % 31 + 12;
        for (int i = 0; i < list.length; i++) {
            int pos = (h1 + (i * h2)) % list.length;
            if (list[pos] != null && element.equals(list[pos]))
                return true;
        }
        return false;
    }

    public boolean deleteWithQuadraticHashing(String element) {
        int baseValue = Math.abs(element.hashCode());

        for (int i = 0; i < list.length; i++) {
            int pos = (baseValue + (i * i)) % list.length;
            if (list[pos] != null && element.equals(list[pos])) {
                list[pos] = TOMBSTONE;
                return true;
            }
        }
        return false;
    }
    public boolean deleteWithDoubleHashing(String element) {
        int baseValue = Math.abs(element.hashCode());
        int h1 = baseValue % list.length;
        int h2 = baseValue % 31 + 12;

        for (int i = 0; i < list.length; i++) {
            int pos = (h1 + (i * h2)) % list.length;
            if (list[pos] != null && element.equals(list[pos])) {
                list[pos] = TOMBSTONE;
                return true;
            }
        }
        return false;
    }
     */
    //----------------------------------------------------
    /*
    //DOUBLYlINKEDlIST
    public void addAtFirst(int id) {
        Node newNode = new Node(id);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    public void addAtLast(int id) {
        Node newNode = new Node(id);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteAtFirstPosition() {
        if (first == null)
            return;
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();

            if(first!=null)
            first.setPrev(null);
        }
    }

    public void deleteAtLastPosition() {
        if (last == null)
            return;
        if (first == last) {
            first = null;
            last = null;
        } else {
            last = last.getPrev();

            if(last!=null)
            last.setNext(null);
        }
    }

    public Node searchID(int id) {
        Node current = first;
            while (current!=null){
                if(current.getId()==id)
                    return current;

                current=current.getNext();
            }
        return null;
    }
     */
    //---------------------------------------
    /*
        //TREE ADD SEARCH
    public void addToTree(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
        } else {
            addRecursive(root, newNode);
        }
    }
    public void addRecursive(Node current, Node newNode) {
        if (newNode.getId() < current.getId()) {
            if (current.getLeft() != null) {
                addRecursive(current.getLeft(), newNode);
            } else {
                current.setLeft(newNode);
                newNode.setParent(current);
            }
        } else {
            if (current.getRight() != null) {
                addRecursive(current.getRight(), newNode);
            } else {
                current.setRight(newNode);
                newNode.setParent(current);
            }
        }
    }
    public Node searchRecursive(Node current, int id) {
        if (current == null || current.getId() == id) {
            return current;
        }
        if (id < current.getId()) {
            return searchRecursive(current.getLeft(), id);
        } else {
            return searchRecursive(current.getRight(), id);
        }
    }
     */
    //----------------------------------------------------
    /*
       //QUEUE ENQUEUEDEQUEUECOUNT
    public void enqueue(int id) {
        Node enqueuedNode = new Node(id);
    if(rear==null){
        front=enqueuedNode;
        rear=enqueuedNode;
    }else{
        rear.setNext(enqueuedNode);
        rear=enqueuedNode;
    }
    }
    public Node dequeued(){
        Node dequeuedNode=front;
        if(front==null){
            return null;
        }else{
            front=front.getNext();
            if(front==null){
                rear=null;
            }
        }
        return dequeuedNode;
    }
    public int countTheQueue(){
        int counter=0;
        Node current= front;
        while (current!=null){
            counter++;
            current=current.getNext();
        }
        return counter;
    }
     */
    //---------------------------------------
    /*
    //STACK PUSHPOPCOUNT
    public void push(int id) {
        Node newNode = new Node(id);
        if (top == null) {
            top = newNode;
        }else {
            newNode.setNext(top);
            top=newNode;
        }
    }
    public Node pop(){
       if(top==null){
           return null;
       }else{
           Node current= top;
           top=top.getNext();
           return current;
       }
    }
    public int countStack(){
        int counter=0;
        Node current=top;
        while(current!=null){
            counter++;
            current=current.getNext();
        }
        return counter;
    }
     */
    //-----------------------------------------
    /*
    //LINKEDlIST
    public void insertAtFirstPosition(int id) {
        Node newNode = new Node(id);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void insertAtLastPosition(int id) {
        Node newNode = new Node(id);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteAtFirstPosition() {
        if (first == null)
            return;
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
        }
    }

    public void deleteAtLastPosition() {
        if (first == null)
            return;
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node current = first;
            while (current != last) {
                if (current.getNext() == last) {
                    current.setNext(null);
                    last = current;
                }
                current = current.getNext();
            }
        }
    }

    public Node searchAtPosition(int position) {
        Node current = first;

        for (int i = 0; i < position; i++) {
            if (current == null) {
                return null;
            } else {
                current = current.getNext();
            }
        }
        return current;
    }

    public Node searchForId(int id) {
        Node current = first;
        while (current != null) {
            if (current.getId() == id) {
                return current;
            }
            current=current.getNext();
        }
        return null;
    }
     */
    //-------------------------------------
    /*
       // GRAPH BRREITENSUCHE
    public void performBreadthSearch(int startVertex, ArrayList<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedArray = new boolean[size];

        queue.add(startVertex);
        visitedArray[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            visited.add(vertex);

            for (int i = 0; i < size; i++) {
                // Prüfen, ob eine Kante existiert und der Knoten nicht besucht wurde
                if (graph[vertex][i] == 1 && !visitedArray[i]) {
                    queue.add(i);
                    visitedArray[i] = true;
                }
            }
        }
    }


    // GRAPH TIEFENSUCHE
    public void performDepthSearch(int startVertex, ArrayList<Integer> visited) {

        visited.add(startVertex);
        for (int i = 0; i < size; i++) {
            //wo gibts eine Verbindung siehe oben
            //        graph[from][to] = 1;
            //        graph[to][from] = 1;
            //       also bei Verbindung ist eine 1 eingetrgen
            if (graph[startVertex][i] == 1) {
                if (!visited.contains(i)) {
                    performDepthSearch(i, visited);
                }
            }
        }
    }
     */
}