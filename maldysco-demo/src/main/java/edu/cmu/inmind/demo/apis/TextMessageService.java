package edu.cmu.inmind.demo.apis;

import edu.cmu.inmind.services.commons.GenericService;

/**
 * Created by oscarr on 8/17/18.
 */
public interface TextMessageService extends GenericService {

    void sendMessage();
}