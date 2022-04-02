package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SaleDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleSearchService extends Remote {
    SaleDTO saleByInvoiceNumber(String invoiceNumber) throws RemoteException;
}