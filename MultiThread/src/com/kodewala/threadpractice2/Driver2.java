package com.kodewala.threadpractice2;


import java.util.concurrent.locks.ReentrantLock;

class SeatReservation
{
    private int seats = 10;

    ReentrantLock reentrant = new ReentrantLock();

    public void reserve(int seatCount) throws InterruptedException
    {
        reentrant.lock();

        if(seats >= seatCount)
        {
            System.out.println(Thread.currentThread().getName()
                    + " is reserving " + seatCount + " seats");

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            seats = seats - seatCount;

            System.out.println(Thread.currentThread().getName()
                    + " reservation completed. Available Seats = " + seats);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()
                    + " Seats Not Available");
        }

        reentrant.unlock();
    }

    public int getSeats()
    {
        return seats;
    }
}

class Passenger extends Thread
{
    SeatReservation reservation;

    public Passenger(SeatReservation reservation)
    {
        this.reservation = reservation;
    }

    public void run()
    {
        try
        {
            reservation.reserve(6);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

public class Driver2
{
    public static void main(String[] args) throws InterruptedException
    {
        SeatReservation reservation = new SeatReservation();

        Passenger p1 = new Passenger(reservation);
        Passenger p2 = new Passenger(reservation);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println("Available Seats = " + reservation.getSeats());
    }
}
