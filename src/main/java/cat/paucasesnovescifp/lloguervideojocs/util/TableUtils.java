/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.util;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author marc
 */
public class TableUtils {
    
    public static void setSorterTable(JTable jTable) {
        javax.swing.table.TableRowSorter<?> sorter = (javax.swing.table.TableRowSorter<?>) jTable.getRowSorter();

        if (sorter != null) {
            java.util.List<javax.swing.RowSorter.SortKey> sortKeys = new java.util.ArrayList<>();
    
            sortKeys.add(new javax.swing.RowSorter.SortKey(0, javax.swing.SortOrder.DESCENDING));
    
            sorter.setSortKeys(sortKeys);
            sorter.sort();
        }
    }
    
    public static ArrayList<String> getFieldsSelected(ListSelectionEvent evt, JTable jTable) {
        ArrayList<String> fieldsList = new ArrayList<>();
        int columnCount = jTable.getColumnCount();
        
        if (!evt.getValueIsAdjusting()) {
            
            int selectedViewRow = jTable.getSelectedRow();

            if (selectedViewRow != -1) {

                int modelRow = jTable.convertRowIndexToModel(selectedViewRow);
                
                for (int i = 0; i < columnCount; i++) {
                    fieldsList.add(jTable.getModel().getValueAt(modelRow, i).toString());
                }

            }
        }
        
        if (!fieldsList.isEmpty()) return fieldsList;
        else return new ArrayList<>(Collections.nCopies(columnCount, ""));
    }
}
