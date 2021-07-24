package com.moriaty.uml.realization;

/**
 * <p>
 * PersonServiceBean
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/24 23:17
 */
public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("delete...");
    }
}
