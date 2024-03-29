package de.percsi.products.dackelcmdb.persistence;



import lombok.*;

import javax.persistence.*;

@Entity(name = Tables.ENTITY_DATA)
@Table(name = Tables.ENTITY_DATA)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EntityDataModelDB {
  
  @Id
  @Column(name = "id")
  Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @MapsId
  private MetaDataModelDB metaData;

  @Column(name = "display_name")
  private String displayName;

  @Column(name = "system_name")
  private String systemName;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private EntityDataType type;


}
