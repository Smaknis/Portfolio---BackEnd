
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Person;
import com.portfolio.Portfolio.model.Portfolio;
import java.util.List;


public interface IPortfolioService {
    
    public List<Person> getPerson();
        
    public Portfolio getPortfolio(Long personId);	
}
