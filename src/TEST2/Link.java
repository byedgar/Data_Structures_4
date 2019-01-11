package TEST2;

class Link {
    public String name;
    public int age;

    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkedList {
    public Link first;
    public Link last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public String delete() {
        Link temp = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp.name;

    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class Queue {
    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(String name, int age) {
        queue.insert(name, age);
    }

    public String delete() {
        return queue.delete();
    }

    public void display() {
        queue.display();
    }

}


