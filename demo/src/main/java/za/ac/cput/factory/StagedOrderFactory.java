package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Pizza;
import za.ac.cput.domain.Pizzeria;
import za.ac.cput.domain.StagedOrder;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.LocalTime;

/* OrderFactory.java
 Author: Keenan Meyer (220194920)
 Date: 16 October (last updated) 2023
*/

    public class StagedOrderFactory {
        public static StagedOrder createOrder(LocalDate createDate, LocalTime time, Customer customer, String qauntity, Pizza pizza, double total, StagedOrder.OrderStatus orderStatus, Pizzeria pizzeria) {
            if (Helper.isNullOrEmpty(String.valueOf(Helper.isNullOrEmpty(String.valueOf(createDate)))) || Helper.isNullOrEmpty(String.valueOf(time))  || Helper.isNullOrEmpty(String.valueOf(customer)) || Helper.isNullOrEmpty(String.valueOf(orderStatus)) || Helper.isNullOrEmpty(String.valueOf(pizzeria)))  {
                return null;
            }

            int orderId = Helper.generateId2();

            StagedOrder stagedOrder = new StagedOrder
                    .Builder()
                    .setOrderId(orderId)
                    .setCreateDate(createDate)
                    .setTime(time)
                    .setCustomer(customer)
                    .setQuantity(qauntity)
                    .setPizza(pizza)
                    .setTotal(total)
                    .setOrderStatus(orderStatus)
                    .setPizzeria(pizzeria)
                    .build();
            return stagedOrder;

        }

    }

