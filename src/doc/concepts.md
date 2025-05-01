---
title: Concepts and Basic Usage  
icon: city  
---

## Batch Operations

For players' convinence, Yunzhu Transit Extension provides batch lift connector and batch floor setting tool, which enables connecting multiple call panels and setting multiple floor numbers in one click. setting features for the MTR Mod.

**Batch Elevator Connection**:  
Hold the **Lift Group Buttons Connector**, manually connect the lift component on the first floor to the corresponding floor rail. The system will automatically connect the remaining floors.  
> ⚠️ Avoid placing regular rails directly beneath the first floor rail, or the connection may fail.

**Batch Floor Setting**:  
Hold the **Batch Floor Setter**, right-click the first floor rail, and the system will increment the remaining floors automatically by integers.  
> ⚠️ Avoid placing regular rails beneath the first floor rail, or the setup may fail. Only integer floors are currently supported.

---

## Lift Call Button (External Call)

### Standard External Call

This is the traditional lift call button placed outside the lift, typically with “Up” and “Down” directional buttons.

**How to Use:**  
Use a **Lift Buttons Connector** or **Lift Group Buttons Connector** to right-click the "call block" and the corresponding "floor rail block" in sequence. A green line will indicate a successful connection.

Aim your crosshair at the desired direction button and right-click to call the lift.

---

### Destination Dispatch Terminal

This is a new type of lift call device equipped with a 3×3 numeric keypad. Players enter the target floor on the terminal, and the system automatically assigns an elevator, displaying its letter ID. Upon entering the designated lift, it will automatically travel to the selected floor.

**How to Use:**  
1. Use a **Lift Buttons Connector** or **Lift Group Buttons Connector** to right-click the "call block" and **all** "floor rail blocks" on this floor. Elevator IDs will start from “A” and follow the connection order. The connection is successful if you see a green line between the call block and the floor rail block.  
2. It is recommended to place signs above each lift doors indicating the letter ID for easy identification.  
3. For more details, please refer to the terminal block’s documentation page.

> Note: The Destination Dispatch Terminal **DOES NOT display real-time lift positions**.

---

## Floor Display Panel (External Display)

This panel shows the current floor and direction of a lift in real time.

**How to Use:**  
Use a **Lift Buttons Connector** or **Lift Group Buttons Connector** to right-click the "call block" and the "floor rail block" in sequence. A green line will confirm a successful connection.

> Note: Some panels can only connect to a single lift and only support limited characters (numbers, basic letters, and a few symbols).

---

## Arrival Indicator Light

This device signals the arrival of a lift. When the lift reaches a floor and opens its doors, the light will indicate the direction of upcoming movement.

**How to Use:**  
1. Use a **Lift Buttons Connector** or **Lift Group Buttons Connector** to connect the "call block" and the "floor rail block" (green line).  
2. Then, use the **Lift Buttons Connector** to connect the target lift's "call block" with the "arrival light block" (yellow line).

> ⚠️ Please follow the steps exactly. Otherwise, the arrival indicator may not function properly.

---

## Combined Floor Display and Arrival Light

This block integrates the features of the "Floor Display Panel" and "Arrival Indicator Light", showing both the lift’s current position and direction.

**How to Use:**  
Follow the same connection steps as the "Arrival Indicator Light" mentioned above.
