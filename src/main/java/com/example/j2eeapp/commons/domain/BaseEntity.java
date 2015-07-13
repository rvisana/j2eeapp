package com.example.j2eeapp.commons.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base entity type to hold common Id property. To be extended.
 */

@MappedSuperclass
public class BaseEntity implements Serializable {
     
	private static final long serialVersionUID = -2435150907688878077L;
		@Id
        @GeneratedValue
        private Long id;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }
        
}
