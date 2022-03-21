package at.fhv.ss22.ea.f.communication.api;


import at.fhv.ss22.ea.f.communication.dto.ProductOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductSearchService extends Remote {
    List<ProductOverviewDTO> fullTextSearch(String query) throws RemoteException;
}
