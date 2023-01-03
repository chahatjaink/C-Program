package com.chahat.carservice.service;

import com.chahat.carservice.domain.CarDomain;
import com.chahat.carservice.domain.ServiceDomain;

import java.util.List;

public class CarService {
    private final CarDomain carDomain;
    private final ServiceDomain serviceDomain;

    public CarService(CarDomain carDomain, ServiceDomain serviceDomain) {
        this.carDomain = carDomain;
        this.serviceDomain = serviceDomain;
    }


    public void generateBill(){
        System.out.println("Type of Car - "+ carDomain.getType());
        System.out.print("Service Codes - ");
        List<String> codes=serviceDomain.getServiceCodes();
        for (int i=0;i<codes.size()-1;i++
             ) {
            System.out.print(codes.get(i) +", ");
        }
            System.out.print(codes.get(codes.size()-1));
        Long amount=generateAmount(carDomain.getType());
        if(amount>10000){
            System.out.println("Complimentary Cleaning included");
        }
        System.out.println("Total Bill - Rs. "+amount);
    }

    public Long generateAmount(String type){
        Long totalAmount = null;
        List<String> serviceCodes= serviceDomain.getServiceCodes();
        if(type.equals("Hatchback")){
            for (String code:serviceCodes
                 ) {
                if(code=="BS01"){
                    System.out.println("Charges for Basic Servicing - Rs. 2000");
                    totalAmount+=2000;
                }
                else if(code=="EF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 5000");
                    totalAmount+=5000;
                }
                else if(code=="CF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 2000");
                    totalAmount+=2000;
                }
                else if(code=="BF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 1000");
                    totalAmount+=1000;
                }
                else if(code=="GF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 3000");
                    totalAmount+=3000;
                }
            }
        }
        else if(type.equals("Sedan")){
            for (String code:serviceCodes
                 ) {
                if(code=="BS01"){
                    System.out.println("Charges for Basic Servicing - Rs. 4000");
                    totalAmount+=4000;
                }
                else if(code=="EF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 8000");
                    totalAmount+=8000;
                }
                else if(code=="CF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 4000");
                    totalAmount+=4000;
                }
                else if(code=="BF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 1500");
                    totalAmount+=1500;
                }
                else if(code=="GF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 6000");
                    totalAmount+=6000;
                }
            }
        }
        else if(type.equals("SUV")){
            for (String code:serviceCodes
                 ) {
                if(code=="BS01"){
                    System.out.println("Charges for Basic Servicing - Rs. 5000");
                    totalAmount+=5000;
                }
                else if(code=="EF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 10000");
                    totalAmount+=10000;
                }
                else if(code=="CF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 6000");
                    totalAmount+=6000;
                }
                else if(code=="BF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 2500");
                    totalAmount+=2500;
                }
                else if(code=="GF01"){
                    System.out.println("Charges for Basic Servicing - Rs. 8000");
                    totalAmount+=8000;
                }
            }
        }
        return totalAmount;
    }

}
