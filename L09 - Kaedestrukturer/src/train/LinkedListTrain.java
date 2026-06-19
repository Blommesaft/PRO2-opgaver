package train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        // TODO: Assignment 1: Implement this add method...
        if (this.firstWagon == null) {
            this.firstWagon = wagon;
        } else {
            WagonNode temp = this.firstWagon;
            this.firstWagon = wagon;
            wagon.setNextWagon(temp);
        }


        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    {
        if (this.firstWagon == null) {
            throw new NoSuchElementException("Train is empty");
        }

        WagonNode temp = this.firstWagon;
        this.firstWagon = this.firstWagon.getNextWagon();

        return temp;
        // TODO: Assignment 2: Implement this remove method...

        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        // TODO: Assignment 3: Implement this count method...
        int count = 0;
        WagonNode current = this.firstWagon;

        while (current != null) {
            count++;
            current = current.getNextWagon();
        }

        return count;

        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        // TODO: Assignment 4: Implement this remove method...
        WagonNode current = this.firstWagon;

        while (current.getNextWagon() != null) {
            if (current.getNextWagon() == wagon) {
                current.setNextWagon(wagon.getNextWagon());

                // Optional: detach the removed wagon
                wagon.setNextWagon(null);

                return true;
            }

            current = current.getNextWagon();
        }

        return false;
        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        // TODO: Assignment 5: Implement this insert method...

        WagonNode current = this.firstWagon;
        int currentPosition = 1;
        while (currentPosition < position) {
            current = current.getNextWagon();
            currentPosition++;
        }
        WagonNode temp = current.getNextWagon();
        current.setNextWagon(wagon);
        wagon.setNextWagon(temp);

        //throw new UnsupportedOperationException("Not implemented");
    }
}
