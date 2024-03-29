package de.percsi.products.dackelcmdb.service.model;

import de.percsi.products.dackelcmdb.service.model.literal.ValueType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PropertyValueOfEntity<T extends ValueType> {

  PropertyOfEntity property;

  ValueOfPropertyOfEntity<T> value;

}
